import { StyleSheet } from 'react-native';

export default StyleSheet.create({
    container: {
        flexGrow: 1,
    },
    titulo: {
        borderBottomWidth: 1,
        padding: 10,
    },
    items: {
        height: 0, /* Gambiarra necessária para funcionar no navegador. */
        flexGrow: 1,
    },
    item: {
        borderBottomWidth: 1,
        padding: 10,
    },
})
