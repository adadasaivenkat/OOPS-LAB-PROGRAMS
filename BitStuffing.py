Data=input("Enter binary data : ")
flag="01111110"
StuffedData=""
StuffedData+=flag
count=0
for i in Data:
    if i=='1':
        count+=1
        StuffedData+=i
        if count==5:
            count=0
            StuffedData+='0'
    else:
        count=0
        StuffedData+=i
StuffedData+=flag
print(f'Stuffed data is {StuffedData}')
temp=list(StuffedData[len(flag):-len(flag)])
UnstuffedData=""
count,i=0,0
while i<len(temp):
    if temp[i]=='1':
        count+=1
        UnstuffedData+=temp[i]
        if count==5 and i+1<len(temp) and temp[i+1]=='0':
            count=0
            i+=1
    else:
        count=0
        UnstuffedData+=temp[i]
    i+=1
print(f'Unstuffed data is {UnstuffedData}')