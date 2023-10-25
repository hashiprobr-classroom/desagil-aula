import React from 'react';
import { View } from 'react-native';
import { useTheme, Text, Switch } from 'react-native-paper';

import { useDark } from '../extras/dark';

import styles from './IndexStyles';

export default function Index(props) {
    const theme = useTheme();

    const [dark, setDark] = useDark();

    return (
        <View style={{
            ...styles.container,
            backgroundColor: theme.colors.background,
        }}>
            <Text>A tela inicial deve ser components/Index.js!</Text>
            <Switch value={dark} onValueChange={() => setDark(!dark)} />
        </View>
    );
}
