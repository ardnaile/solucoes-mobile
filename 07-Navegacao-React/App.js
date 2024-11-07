import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import HomeScreen from './components/HomeScreen';
import DetailsScreen from './components/DetailsScreen';
import MoviesScreen from './components/MoviesScreen';

export default function App(){
	return (
		<NavigationContainer>
			 <Stack.Navigator initialRouteName="Home" >
				 <Stack.Screen name="HomeScreen" component={HomeScreen}/>
				 <Stack.Screen name="DetailsScreen" component={DetailsScreen}/>
				 <Stack.Screen name="MoviesScreen" component={MoviesScreen}/>
			 </Stack.Navigator>
		</NavigationContainer>
	);
}

const Stack = createNativeStackNavigator();

