age = isinstance(51,int)
print("age is an integer:", age)

#Example : isinstance() Float check
pi = isinstance(3.14,float)
print("pi is a float:", pi)

#Example: isinstance() String check
message = isinstance("Hello World",str)
print("message is a string:", message)

#Example : isinstance() Tuple check
my_tuple = isinstance((1,2,3,4,5),tuple)
print("my_tuple is a tuple:", my_tuple)

#Example : isinstance() Set check
my_set = isinstance({1,2,3,4,5},set)
print("my_set is a set:", my_set)




class MyClass:
    _message = "Hello World"
_class = MyClass()
print("_class is a instance of MyClass() : ", isinstance(_class,MyClass))
