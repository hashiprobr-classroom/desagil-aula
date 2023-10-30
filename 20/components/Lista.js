import React from 'react';
import { ScrollView } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { Text, TouchableRipple } from 'react-native-paper';

import styles from './ListaStyles.js';

import { map } from '../extras/map';

function Item(props) {
    const navigation = useNavigation();

    function clique() {
        navigation.navigate('Formulario');
    }

    return (
        <TouchableRipple style={styles.item} onPress={clique}>
            <Text>{props.nome}</Text>
        </TouchableRipple>
    );
}

export default function Lista(props) {
    const gatos = [
        { nome: 'Gato 1' },
        { nome: 'Gato 2' },
        { nome: 'Gato 3' },
        { nome: 'Gato 4' },
        { nome: 'Gato 5' },
        { nome: 'Gato 6' },
        { nome: 'Gato 7' },
        { nome: 'Gato 8' },
        { nome: 'Gato 9' },
        { nome: 'Gato 10' },
        { nome: 'Gato 11' },
        { nome: 'Gato 12' },
        { nome: 'Gato 13' },
        { nome: 'Gato 14' },
        { nome: 'Gato 15' },
        { nome: 'Gato 16' },
        { nome: 'Gato 17' },
        { nome: 'Gato 18' },
        { nome: 'Gato 19' },
        { nome: 'Gato 20' },
        { nome: 'Gato 21' },
        { nome: 'Gato 22' },
        { nome: 'Gato 23' },
        { nome: 'Gato 24' },
        { nome: 'Gato 25' },
        { nome: 'Gato 26' },
        { nome: 'Gato 27' },
        { nome: 'Gato 28' },
        { nome: 'Gato 29' },
        { nome: 'Gato 30' },
        { nome: 'Gato 31' },
        { nome: 'Gato 32' },
    ];

    return (
        <ScrollView style={styles.container}>
            {map(gatos, (gato) => <Item nome={gato.nome} />)}
        </ScrollView>
    );
}
