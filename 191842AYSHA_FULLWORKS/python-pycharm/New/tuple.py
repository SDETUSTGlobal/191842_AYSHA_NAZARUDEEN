a = {'tim': 18, 'charlie': 12, 'anu': 15}
boys = { 'tim': 18, 'charlie': 12}
girls = {'anu': 15}
studentX=boys.copy()
studentY=girls.copy()
print(studentX)
print(studentY)
a.update({'sarah': 9})
print(a)
del a['charlie']
print (a)