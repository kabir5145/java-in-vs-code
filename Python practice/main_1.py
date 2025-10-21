# Check voting eligibility based on user input age

a = (input("Enter your age :"))

if a.isdigit():
    age = int(a)
    if age>=18:
        print("You are eligible to vote.")
    else:
        print("You are not eligible to vote.")