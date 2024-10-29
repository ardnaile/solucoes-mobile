import React, { useEffect, useState }  from 'react';
import { View, Text, Button, StyleSheet, ActivityIndicator} from 'react-native';

export default function MoviesScreen({navigation}){		

    useEffect(() => { 
      getMovies();
    }, []);

		const [isLoading, setLoading] = useState(true);
		const [data, setData] = useState([]);
		
		const getMovies = async () => {
			try {
				const response = await fetch("https://reactnative.dev/movies.json");
				const json = await response.json(); // transformando em json
				setData(json.movies);
			} catch (error) {
				console.error(error);
			} finally {
				setLoading(false);
			}
		};
		return(
			<View style={{ flex: 1, alignItems: "center", justifyContent: "center" }}>
				{isLoading ? (
				<ActivityIndicator />
				) : (
			<View>
				{data.map((item) => (
					<Text key={item.id}>{item.title} - {item.releaseYear}</Text>
				))}
			</View>
			)}
			</View>
		);
}
