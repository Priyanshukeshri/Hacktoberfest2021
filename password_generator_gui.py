from tkinter import *
from tkinter import messagebox

import random

root = Tk()
root.geometry("400x200")

passstr = StringVar()
passlen = IntVar()
passlen.set(0)


def checkPassLen():
    if (passlen.get() >= 6 and passlen.get() <= 14):
        generatePassword()
    else:
        messagebox.showinfo(
            "Error!!",
            "Min required length is atleast 6 characters and at max 14 characters"
        )


def generatePassword():
    passCharacters = [
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',
        'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4',
        '5', '6', '7', '8', '9', '0', ' ', '!', '@', '#', '$', '%', '^', '&',
        '*', '(', ')'
    ]

    password = ""

    for i in range(passlen.get()):
        password = password + random.choice(passCharacters)
        passstr.set(password)


Label(root, text="Password Generator Application",
      font="calibri 20 bold").pack()
Label(root, text="Enter password length").pack(pady=3)
Entry(root, textvariable=passlen).pack(pady=3)
Button(root, text="generate Password", command=checkPassLen).pack(pady=7)
Entry(root, textvariable=passstr).pack(pady=3)

root.mainloop()
