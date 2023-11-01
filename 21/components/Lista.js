import React, { useState, useEffect } from 'react';
import { ScrollView } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { Text, TouchableRipple } from 'react-native-paper';
import axios from 'axios';

import styles from './ListaStyles.js';

import { map } from '../extras/map';

import settings from '../settings.json';

function Item(props) {
    const navigation = useNavigation();

    function clique() {
        navigation.navigate('Formulario', props.gato);
    }

    return (
        <TouchableRipple style={styles.item} onPress={clique}>
            <Text>{props.gato.nome}</Text>
        </TouchableRipple>
    );
}

export default function Lista(props) {
    const [gatos, setGatos] = useState([]);

    useEffect(() => {
        async function get() {
            try {
                const response = await axios.get(settings.url + '/gatos');
                setGatos(response.data);
            } catch (error) {
                console.log(error);
            }
        }
        get();
    }, []);

    return (
        <ScrollView style={styles.container}>
            {map(gatos, (gato) => <Item gato={gato} />)}
        </ScrollView>
    );
}
