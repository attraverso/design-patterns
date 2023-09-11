### use
extend behavior at runtime

### possible drawbacks
- this pattern generates a lot of small classes that can be confusing to someone who doesn't know the pattern
- it's all well and good while you program to the interface, but if you are programming to concrete classes or plan to do so, the decorator pattern will break your code
  - eg. you check that a class is of X type to apply a discount: the decorator will wrap that class and mask it
- the decorators aren't aware of what each other or the parent does. Trying to look at multiple layers in the decorator chain goes beyond the scope of the pattern, but it's doable with workarounds.
  - eg. you don't want to end up with "Mocha, Mocha" in the description but you would like "double Mocha": you could use a final decorator that parses the string and rewrites it as you like

### notes
follows the Open/Closed principle