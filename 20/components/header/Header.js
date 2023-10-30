import React from 'react';
import { View } from 'react-native';
import { Text } from 'react-native-paper';
import Icon from 'react-native-vector-icons/MaterialCommunityIcons';

import styles from './HeaderStyles.js';

export default function HeaderTitle(props) {
    const { options } = props;

    return (
        <View style={styles.container}>
            <Icon style={styles.icon} name="arrow-left" size={20} />
            <Text variant="titleLarge">{options.title}</Text>
        </View>
    );
}
