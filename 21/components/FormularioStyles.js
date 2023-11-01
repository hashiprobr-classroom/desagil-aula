import { StyleSheet } from 'react-native';

export default StyleSheet.create({
    container: {
        height: 0, /* Gambiarra necessária para funcionar no navegador. */
        flexGrow: 1,
        paddingTop: 10,
        paddingRight: 10,
        paddingLeft: 10,
    },
    foto: {
        width: '50%',
        aspectRatio: 1,
        alignSelf: 'center',
        marginBottom: 10,
        borderRadius: 50,
    },
    campo: {
        marginBottom: 10,
    },
})
