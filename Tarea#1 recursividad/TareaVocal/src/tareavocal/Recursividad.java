package tareavocal;

/**
 *
 * @author Cristofer
 */
public class Recursividad {

    public char[] Vocal(int i, char[] array) {
        if (i == array.length) {
            return array;
        } else {
            char aux = array[i];
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'
                    || aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                array[i] = ' ';
            }
            return Vocal(++i, array);
        }
    }
}
