package LabFive.HashSetLab;

import java.util.HashSet;

public class NameHashSet {
    private final HashSet<String> _nameHashSet = new HashSet<>();

    public HashSet<String> getNameHashSet(){
        return this._nameHashSet;
    }
    public boolean addName(String name){
        int beforeSize = _nameHashSet.size();
        _nameHashSet.add(name);
        return beforeSize != _nameHashSet.size();
    }

    public boolean search(String name){
        return _nameHashSet.stream().anyMatch(e -> e.equals(name));
    }
}
