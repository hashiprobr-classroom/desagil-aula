import React from 'react';
import { ScrollView } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { Text, TouchableRipple } from 'react-native-paper';

import styles from './ListaStyles.js';

function Item(props) {
    function clique() {
        console.log('clicou em ' + props.nome);
    }

    return (
        <TouchableRipple style={styles.item} onPress={clique}>
            <Text>{props.nome}</Text>
        </TouchableRipple>
    );
}

export default function Lista(props) {
    return (
        <SafeAreaView style={styles.container}>
            <Text style={styles.titulo} variant="titleLarge">Gatos para adoção</Text>
            <ScrollView style={styles.items}>
                <Item nome="Gato 1" />
                <Item nome="Gato 2" />
                <Item nome="Gato 3" />
                <Item nome="Gato 4" />
                <Item nome="Gato 5" />
                <Item nome="Gato 6" />
                <Item nome="Gato 7" />
                <Item nome="Gato 8" />
                <Item nome="Gato 9" />
                <Item nome="Gato 10" />
                <Item nome="Gato 11" />
                <Item nome="Gato 12" />
                <Item nome="Gato 13" />
                <Item nome="Gato 14" />
                <Item nome="Gato 15" />
                <Item nome="Gato 16" />
                <Item nome="Gato 17" />
                <Item nome="Gato 18" />
                <Item nome="Gato 19" />
                <Item nome="Gato 20" />
                <Item nome="Gato 21" />
                <Item nome="Gato 22" />
                <Item nome="Gato 23" />
                <Item nome="Gato 24" />
                <Item nome="Gato 25" />
                <Item nome="Gato 26" />
                <Item nome="Gato 27" />
                <Item nome="Gato 28" />
                <Item nome="Gato 29" />
                <Item nome="Gato 30" />
                <Item nome="Gato 31" />
                <Item nome="Gato 32" />
            </ScrollView>
        </SafeAreaView>
    );
}
