import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class IntegersList implements Math, Sort {
    private final ArrayList<Integer> _integersList;

    public IntegersList() {
        _integersList = new ArrayList<>();
    }

    public IntegersList(int[] arr) {
        _integersList = new ArrayList<>(IntStream.of(arr).boxed().toList());
    }

    public IntegersList(List<Integer> list) {
        _integersList = new ArrayList<>(list);
    }

    public void add(Integer integer) {
        _integersList.add(integer);
    }

    public void add(int index, Integer integer) {
        _integersList.add(index, integer);
    }

    public boolean addAll(Collection<Integer> c) {
        return _integersList.addAll(c);
    }

    public boolean addAll(int index, Collection<Integer> c) {
        return _integersList.addAll(index, c);
    }

    public Integer set(int index, Integer integer) {
        return _integersList.set(index, integer);
    }

    public boolean remove(Integer integer) {
        return _integersList.remove(integer);
    }

    public Integer remove(int index) {
        return _integersList.remove(index);
    }

    public Integer get(int index) {
        return _integersList.get(index);
    }

    public int size() {
        return _integersList.size();
    }

    @Override
    public int Max() {
        int max = Integer.MIN_VALUE;

        for (int value : _integersList) {
            max = java.lang.Math.max(max, value);
        }
        return max;
        //return _integersList.stream().mapToInt(Integer::intValue).max();
    }

    @Override
    public int Min() {
        int min = Integer.MAX_VALUE;

        for (int value : _integersList) {
            min = java.lang.Math.min(min, value);
        }
        return min;
        //return _integersList.stream().mapToInt(Integer::intValue).max();
    }

    @Override
    public float Avg() {
        float sum = _integersList.stream().mapToInt(Integer::intValue).sum();
        return sum / _integersList.size();

        //return _integersList.stream().mapToInt(Integer::intValue).average();
    }

    @Override
    public void SortAsc() {
        _integersList.sort(Integer::compare);
    }

    @Override
    public void SortDesc() {
        _integersList.sort(Collections.reverseOrder(Integer::compare));
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < _integersList.size(); i++) {
            builder.append(_integersList.get(i).toString());
            if (i != _integersList.size() - 1) builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

}
