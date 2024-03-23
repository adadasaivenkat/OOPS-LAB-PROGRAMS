def XOR(divi, divisor):
    result = ''
    for i in range(1, len(divi)):
        if divi[i] == divisor[i]:
            result += '0'
        else:
            result += '1'
    return result


def CrcRemainder(data, poly):
    divi = data[0:len(poly)]
    i = len(poly)
    while i < len(data):
        if divi[0] == '1':
            divi = XOR(divi, poly)+data[i]
        else:
            divi = XOR(divi, '0'*len(poly))+data[i]
        i += 1
    if divi[0] == '1':
        divi = XOR(divi, poly)
    else:
        divi = XOR(divi, '0'*len(poly))
    return divi


data = input("Enter data : ")
poly = input("Enter polynomial : ")
temp = data+'0'*(len(poly)-1)
print(f"The Cyclic Redundancy Check (CRC) value is {CrcRemainder(temp,poly)}")
EncodedData = data+CrcRemainder(temp, poly)
print("Encoded data is : ", EncodedData)
ReceivedData = input("Enter received data : ")
Syndrome = CrcRemainder(ReceivedData, poly)
print(f"The Syndrome (Receiver's side remainder) is {Syndrome}")
if Syndrome == '0'*(len(poly)-1):
    print("No error!")
else:
    print("Error generated!")
