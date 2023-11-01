import React from 'react';
import { View } from 'react-native';
import { Text } from 'react-native-paper';
import Icon from 'react-native-vector-icons/MaterialCommunityIcons';

import styles from './HeaderStyles.js';

export default function HeaderTitle(props) {
    const { options, navigation } = props;

    return (
        <View style={styles.container}>
            {options.back && (
                <Icon style={styles.icon} name="arrow-left" size={20} onPress={() => navigation.goBack()} />
            )}
            <Text variant="titleLarge">{options.title}</Text>
        </View>
    );
}
