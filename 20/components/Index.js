import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';

import Header from './header/Header';

import Lista from './Lista';
import Formulario from './Formulario';

const Stack = createStackNavigator();

export default function Index(props) {
    return (
        <Stack.Navigator initialRouteName="Lista" screenOptions={{ header: Header }}>
            <Stack.Screen name="Lista" component={Lista} options={{ title: 'Gatos para adoção' }} />
            <Stack.Screen name="Formulario" component={Formulario} />
        </Stack.Navigator>
    );
}
