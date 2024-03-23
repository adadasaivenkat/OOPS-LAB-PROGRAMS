Data=input("Enter data : ")
flag="f"
esc="e"
StuffedData=""
StuffedData+=flag
count=0
for i in Data:
    if i==flag or i==esc:
        StuffedData+=esc+i
    else:
        StuffedData+=i
StuffedData+=flag
print(f'Stuffed data is {StuffedData}')
UnstuffedData=""
i=0
while i<len(StuffedData):
    if StuffedData[i]==flag:
        i+=1
    elif StuffedData[i]==esc:
        if StuffedData[i+1]==flag or StuffedData[i+1]==esc:
            UnstuffedData+=StuffedData[i+1]
            i+=2
    else:
        UnstuffedData+=StuffedData[i]
        i+=1
print(f'Unstuffed data is {UnstuffedData}')