import React, { useState } from 'react';
import { StyleSheet, View, TextInput, Button, Alert } from 'react-native';

const App = () => {
  const [userInput, setUserInput] = useState('');

  const handleCheckNumber = () => {
    const userNumber = parseInt(userInput, 10);
    const randomNumber = Math.floor(Math.random() * 11); // Gera número aleatório de 0 a 10

    if (isNaN(userNumber) || userNumber < 0 || userNumber > 10) {
      Alert.alert('Erro', 'Por favor, insira um número entre 0 e 10.');
      return;
    }

    if (userNumber === randomNumber) {
      Alert.alert('Resultado', 'Você acertou!');
    } else {
      Alert.alert('Resultado', `Você errou! O número era ${randomNumber}.`);
    }
  };

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        placeholder="Digite um número de 0 a 10"
        keyboardType="numeric"
        value={userInput}
        onChangeText={setUserInput}
      />
      <Button title="Verificar" onPress={handleCheckNumber} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    marginBottom: 20,
    width: '80%',
    padding: 10,
  },
});

export default App;
