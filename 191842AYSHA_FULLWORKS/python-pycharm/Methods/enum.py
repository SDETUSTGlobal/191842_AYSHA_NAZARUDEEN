mylist = ['A', 'B' ,'C', 'D']
e_list = enumerate(mylist)
print(list(e_list))

mylist = ['A', 'B' ,'C', 'D']
for i in enumerate(mylist):
  print(i)
  print("\n")
print("Using startIndex as 10")
for i in enumerate(mylist, 10):
  print(i)
  print("\n")

  my_tuple = ("A", "B", "C", "D", "E")
  for i in enumerate(my_tuple):
      print(i)


  my_str = "Guru99 "
  for i in enumerate(my_str):
      print(i)


  my_dict = {"a": "PHP", "b": "JAVA", "c": "PYTHON", "d": "NODEJS"}
  for i in enumerate(my_dict):
      print(i)
