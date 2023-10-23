import React from 'react';
import { useTheme } from '@react-navigation/native';
import { create{base}Navigator } from '@react-navigation/{type}';

import XXX from './XXX';
import YYY from './YYY';

const {base} = create{base}Navigator();

export default function {name}(props) {
    const theme = useTheme();

    return (
        <{base}.Navigator initialRouteName="" screenOptions={theme.screenOptions}>
            <{base}.Screen name="XXX" component={XXX} />
            <{base}.Screen name="YYY" component={YYY} />
        </{base}.Navigator>
    );
}
