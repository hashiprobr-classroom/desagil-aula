import React from 'react';
import { View, ScrollView, Image } from 'react-native';
import { Button, TextInput } from 'react-native-paper';
import DropDown from 'react-native-paper-dropdown';
import { DatePickerInput } from 'react-native-paper-dates';

import styles from './FormularioStyles.js';

export default function Formulario(props) {
    const sexos = [
        { label: 'Fêmea', value: 'FEMEA' },
        { label: 'Macho', value: 'MACHO' },
    ];

    const dataDeNascimento = new Date();

    const dataDeResgate = new Date();

    const { navigation } = props;

    navigation.setOptions({ title: 'Gato' });

    return (
        <ScrollView style={styles.container}>
            <Image style={styles.foto} source={require('../assets/gato.jpeg')} />

            <TextInput style={styles.campo} label="Nome" onChangeText={(text) => console.log(text)} />

            <View style={styles.campo}>
                <DropDown
                    label="Sexo"
                    visible={false}
                    showDropDown={() => console.log('showDropDown')}
                    onDismiss={() => console.log('onDismiss')}
                    list={sexos}
                    value="FEMEA"
                    setValue={(value) => console.log(value)}
                />
            </View>

            <TextInput style={styles.campo} label="Raça" onChangeText={(text) => console.log(text)} />
            <TextInput style={styles.campo} label="Tipo de pelagem" onChangeText={(text) => console.log(text)} />
            <TextInput style={styles.campo} label="Cor dos olhos" onChangeText={(text) => console.log(text)} />

            <DatePickerInput
                style={styles.campo}
                locale="pt"
                label="Data de nascimento"
                visible={false}
                value={dataDeNascimento}
                onChange={(value) => console.log(value)}
            />

            <DatePickerInput
                style={styles.campo}
                locale="pt"
                label="Data de resgate"
                visible={false}
                value={dataDeResgate}
                onChange={(value) => console.log(value)}
            />

            <Button style={styles.campo} onPress={() => console.log('onPress')}>Salvar</Button>
        </ScrollView>
    );
}
