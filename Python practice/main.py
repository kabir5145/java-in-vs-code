# Question-1 Formatted Twinkle Poem

# a = """Twinkle, twinkle, little star,
# 	How I wonder what you are! 
# 		Up above the world so high,   		
# 		Like a diamond in the sky. 
# Twinkle, twinkle, little star, 
# 	How I wonder what you are"""
# print(a)

# Question-2 Python Version Checker
# import sys

# print("Python version")
# print (sys.version)

# print("Version info.")
# print (sys.version_info)

# Question-3 Current Date and Time
# import datetime
# now = datetime.datetime.now()
# print ("Current date and time : ")
# print (now.strftime("%Y-%m-%d %H:%M:%S"))

# Question-4 Circle Area Calculator
# a = float(input("Input the radius of the circle : "))
# area = 3.14 * a**2
# print ("The area of the circle with radius " + str(a) + " is: " + str(area))

# Question-5 Reverse String
a = list(input("Enter the string : "))

start=0
end= len(a)-1

while start<end:
    temp=a[start]
    a[start]=a[end]
    a[end]=temp
    start+=1
    end-=1

print("Reversed string is : " + "".join(a))

# Question - 6 List and Tuple Generator

values = input("Some numbers : ")

list = values.split(",")

tuple = tuple(list)


print('List : ', list)
print('Tuple : ', tuple)

    