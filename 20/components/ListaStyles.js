import { StyleSheet } from 'react-native';

export default StyleSheet.create({
    container: {
        height: 0, /* Gambiarra necessária para funcionar no navegador. */
        flexGrow: 1,
        paddingTop: 10,
        paddingRight: 10,
        paddingLeft: 10,
    },
    item: {
        marginBottom: 10,
        padding: 10,
        backgroundColor: '#eeeeee',
        borderRadius: 5,
    },
})
