JAVAC = javac
JAVA = java
# Sources = add all your .java files you waint to compile
# Classes = same format as Sources but as .classes
SOURCES = Main.java 
CLASSES = Main.class 

all: $(CLASSES)

%.class: %.java
	$(JAVAC) $<

run: $(CLASSES)
	$(JAVA) Main 

clean:
	rm -f $(CLASSES)