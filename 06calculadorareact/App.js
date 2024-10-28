import React, { useState } from 'react';
import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';

export default function App() {
  const [input, setInput] = useState('');
  const [result, setResult] = useState(null);

  const handlePress = (value) => {
    setInput(input + value);
  };

  const handleClear = () => {
    setInput('');
    setResult(null);
  };

  const handleCalculate = () => {
    try {
      setResult(eval(input)); // Avalia a expressão, evitar usar em contexto real por segurança
    } catch (error) {
      setResult('Erro');
    }
  };

  const renderButton = (value) => (
    <TouchableOpacity onPress={() => handlePress(value)} style={styles.button}>
      <Text style={styles.buttonText}>{value}</Text>
    </TouchableOpacity>
  );

  return (
    <View style={styles.container}>
      <Text style={styles.display}>{input}</Text>
      {result !== null && <Text style={styles.result}>Resultado: {result}</Text>}
      <View style={styles.row}>{['1', '2', '3'].map(renderButton)}</View>
      <View style={styles.row}>{['4', '5', '6'].map(renderButton)}</View>
      <View style={styles.row}>{['7', '8', '9'].map(renderButton)}</View>
      <View style={styles.row}>
        {renderButton('0')}
        {renderButton('+')}
        {renderButton('-')}
      </View>
      <View style={styles.row}>
        {renderButton('*')}
        {renderButton('/')}
        <TouchableOpacity onPress={handleClear} style={styles.button}>
          <Text style={styles.buttonText}>C</Text>
        </TouchableOpacity>
      </View>
      <View style={styles.row}>
        <TouchableOpacity onPress={handleCalculate} style={styles.button}>
          <Text style={styles.buttonText}>=</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 16,
    backgroundColor: '#fff',
  },
  display: {
    fontSize: 32,
    marginBottom: 10,
    textAlign: 'right',
  },
  result: {
    fontSize: 24,
    marginBottom: 20,
    textAlign: 'right',
  },
  row: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: 10,
  },
  button: {
    flex: 1,
    backgroundColor: '#5E5E5E',
    padding: 20,
    margin: 5,
    borderRadius: 5,
    alignItems: 'center',
    justifyContent: 'center',
  },
  buttonText: {
    color: '#fff',
    fontSize: 24,
  },
});
