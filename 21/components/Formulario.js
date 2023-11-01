import React, { useState } from 'react';
import { View, ScrollView, Image } from 'react-native';
import { Button, TextInput } from 'react-native-paper';
import DropDown from 'react-native-paper-dropdown';
import { DatePickerInput } from 'react-native-paper-dates';
import axios from 'axios';

import styles from './FormularioStyles.js';

import settings from '../settings.json';

export default function Formulario(props) {
    const sexos = [
        { label: 'Fêmea', value: 'FEMEA' },
        { label: 'Macho', value: 'MACHO' },
    ];

    const { navigation, route } = props;

    const gato = route.params;

    navigation.setOptions({ back: true, title: gato.nome });

    const [nome, setNome] = useState(gato.nome);
    const [visivel, setVisivel] = useState(false);
    const [sexo, setSexo] = useState(gato.sexo);
    const [raca, setRaca] = useState(gato.raca);
    const [tipoDePelagem, setTipoDePelagem] = useState(gato.tipoDePelagem);
    const [corDosOlhos, setCorDosOlhos] = useState(gato.corDosOlhos);
    const [dataDeNascimento, setDataDeNascimento] = useState(new Date(gato.dataDeNascimento));
    const [dataDeResgate, setDataDeResgate] = useState(new Date(gato.dataDeResgate));

    function dateToString(date) {
        return date.toISOString().substring(0, 10);
    }

    async function put() {
        try {
            axios.put(settings.url + '/gatos', {
                id: gato.id,
                nome: nome,
                sexo: sexo,
                raca: raca,
                tipoDePelagem: tipoDePelagem,
                corDosOlhos: corDosOlhos,
                dataDeNascimento: dateToString(dataDeNascimento),
                dataDeResgate: dateToString(dataDeResgate),
            });
        } catch (error) {
            console.log(error);
        }
    }

    return (
        <ScrollView style={styles.container}>
            <Image style={styles.foto} source={require('../assets/gato.jpeg')} />

            <TextInput style={styles.campo} label="Nome" value={nome} onChangeText={setNome} />

            <View style={styles.campo}>
                <DropDown
                    label="Sexo"
                    visible={visivel}
                    showDropDown={() => setVisivel(true)}
                    onDismiss={() => setVisivel(false)}
                    list={sexos}
                    value={sexo}
                    setValue={setSexo}
                />
            </View>

            <TextInput style={styles.campo} label="Raça" value={raca} onChangeText={setRaca} />
            <TextInput style={styles.campo} label="Tipo de pelagem" value={tipoDePelagem} onChangeText={setTipoDePelagem} />
            <TextInput style={styles.campo} label="Cor dos olhos" value={corDosOlhos} onChangeText={setCorDosOlhos} />

            <DatePickerInput
                style={styles.campo}
                locale="pt"
                label="Data de nascimento"
                value={dataDeNascimento}
                onChange={setDataDeNascimento}
            />

            <DatePickerInput
                style={styles.campo}
                locale="pt"
                label="Data de resgate"
                value={dataDeResgate}
                onChange={setDataDeResgate}
            />

            <Button style={styles.campo} onPress={put}>Salvar</Button>
        </ScrollView>
    );
}
