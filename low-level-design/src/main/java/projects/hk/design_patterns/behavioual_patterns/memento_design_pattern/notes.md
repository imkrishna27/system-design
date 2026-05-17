### There are three components in Memento pattern
1. Originator 
    #### State,createMemento(),restoreMemento()
2. Memento 
    #### State,setState(),getState()
3. Caretaker
    #### List<Memento> addMemento(Memento),undo()