import React, { useEffect } from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';

export default function HomeScreen({navigation}){
  

	return (
		<View>
			<Text> Estamos na Home </Text>
			<Button 
				title="Go to Produto"
				onPress={() => navigation.navigate('DetailsScreen')}
			/>
		</View>
	);
}