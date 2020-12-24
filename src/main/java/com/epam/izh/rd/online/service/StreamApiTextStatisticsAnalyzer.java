package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.helper.Direction;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.*;

/**
 * Данный класс обязан использовать StreamApi из функционала Java 8. Функциональность должна быть идентична
 * {@link SimpleTextStatisticsAnalyzer}.
 */
public class StreamApiTextStatisticsAnalyzer implements TextStatisticsAnalyzer {
    TextStatisticsAnalyzer analyzer = new SimpleTextStatisticsAnalyzer();

    @Override
    public int countSumLengthOfWords(String text) {
        return analyzer.countSumLengthOfWords(text);
    }

    @Override
    public int countNumberOfWords(String text) {
        return analyzer.countNumberOfWords(text);
    }

    @Override
    public int countNumberOfUniqueWords(String text) {
        return analyzer.countNumberOfUniqueWords(text);
    }

    @Override
    public List<String> getWords(String text) {
        return analyzer.getWords(text);
    }

    @Override
    public Set<String> getUniqueWords(String text) {
        return analyzer.getUniqueWords(text);
    }

    @Override
    public Map<String, Integer> countNumberOfWordsRepetitions(String text) {
        return analyzer.countNumberOfWordsRepetitions(text);
    }

    @Override
    public List<String> sortWordsByLength(String text, Direction direction) {
        return analyzer.sortWordsByLength(text, direction);
    }
}
