import timeit
import_module = "import random"
testcode = ''' 
def test(): 
    return random.randint(10, 100)
'''
print(timeit.repeat(stmt=testcode, setup=import_module, repeat=5))

import timeit
import random


def test():
    return random.randint(10, 100)


starttime = timeit.default_timer()
print("The start time is :", starttime)
test()
print("The time difference is :", timeit.default_timer() - starttime)