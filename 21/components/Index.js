import React from 'react';
import { SafeAreaView } from 'react-native-safe-area-context';
import { createStackNavigator } from '@react-navigation/stack';

import Header from './header/Header';

import Lista from './Lista';
import Formulario from './Formulario';

const Stack = createStackNavigator();

export default function Index(props) {
    return (
        <SafeAreaView style={{ flexGrow: 1 }}>
            <Stack.Navigator initialRouteName="Lista" screenOptions={{ header: Header }}>
                <Stack.Screen name="Lista" component={Lista} options={{ back: false, title: 'Gatos para adoção' }} />
                <Stack.Screen name="Formulario" component={Formulario} />
            </Stack.Navigator>
        </SafeAreaView>
    );
}
