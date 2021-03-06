package Construct;/*
    
/**
  *@Author JunLin
  *@Date 2020/11/29
  *@Describe:
 */

import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
