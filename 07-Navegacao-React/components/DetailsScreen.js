import React, { useEffect }  from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';

export default function DetailsScreen({navigation}){
	return (
		<View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
			<Text> Estamos visualizando um produto </Text>
			
			<Button
				title="Listar filmes"
				onPress={() => navigation.navigate("MoviesScreen")}
			/>
			
			<Button 
				title="Voltar"
				onPress={() => navigation.goBack()}
			/>
		</View>
	);
}
