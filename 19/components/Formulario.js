import React from 'react';
import { Image, ScrollView } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { Button, TextInput } from 'react-native-paper';

import styles from './FormularioStyles.js';

export default function Formulario(props) {
    return (
        <SafeAreaView style={styles.container}>
            <ScrollView style={styles.scroll}>
                <Image style={styles.foto} source={require('../assets/gato.jpeg')} />
                <TextInput style={styles.campo} label="Nome" />
                <TextInput style={styles.campo} label="Sexo" />
                <TextInput style={styles.campo} label="Raça" />
                <TextInput style={styles.campo} label="Tipo de pelagem" />
                <TextInput style={styles.campo} label="Cor dos olhos" />
                <TextInput style={styles.campo} label="Data de nascimento" />
                <TextInput style={styles.campo} label="Data de resgate" />
                <Button>Atualizar</Button>
            </ScrollView>
        </SafeAreaView>
    );
}
