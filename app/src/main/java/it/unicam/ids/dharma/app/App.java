/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unicam.ids.dharma.app;

import it.unicam.ids.dharma.list.LinkedList;

import static it.unicam.ids.dharma.utilities.StringUtils.join;
import static it.unicam.ids.dharma.utilities.StringUtils.split;
import static it.unicam.ids.dharma.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
