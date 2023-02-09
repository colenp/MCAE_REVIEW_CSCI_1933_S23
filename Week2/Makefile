JAVAC = javac
JAVA = java
# Sources = add all your .java files you waint to compile
# Classes = same format as Sources but as .classes
SOURCES = Sudoku.java Sudoku.java
CLASSES = Sudoku.class Sudoku.class

all: $(CLASSES)

%.class: %.java
	$(JAVAC) $<

run: $(CLASSES)
	$(JAVA) Sudoku

clean:
	rm -f $(CLASSES)