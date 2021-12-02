def main():
	x,y =2,8
	if(x < y):
		st= "x is less than y"
	print(st)
if __name__ == "__main__":
	main()

	total = 100
	# country = "US"
	country = "AU"
	if country == "US":
		if total <= 50:
			print("Shipping Cost is  $50")
	elif total <= 100:
		print("Shipping Cost is $25")
	elif total <= 150:
		print("Shipping Costs $5")
	else:
		print("FREE")
	if country == "AU":
		if total <= 50:
			print("Shipping Cost is  $100")
	else:
		print("FREE")

