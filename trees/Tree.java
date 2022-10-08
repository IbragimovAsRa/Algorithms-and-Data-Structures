package trees;

class Tree {
    private Node root;

    public Node find(int key) {
        Node current = root;
        while(current.iData != key)
        {
            if(key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild; // Или направо?
            if(current == null)
                return null;
        }
        return current;
    }

    public void insert(int id, double dd) {
    }

    public void delete(int id) {
    }

}


// Другие методы
// Конец класса Tree