def testyield():
  yield "Welcome to Python "

output = testyield()
for i in output:
    print(i)


    def test(n):
        return n * n


    def getSquare(n):
        for i in range(n):
            yield test(i)


    sq = getSquare(10)
    for i in sq:
        print(i)
