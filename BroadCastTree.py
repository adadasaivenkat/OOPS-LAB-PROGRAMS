def DecToBin(d):
    b=[]
    for i in d:
        b.append(bin(i)[2:].zfill(8))
    return b

def BinToDec(b):
    d=[]
    for i in b:
        d.append(int(i,2))
    return d

ip=list(map(int,input("Enter IP address : ").split(".")))
if len(ip)!=4:
    print("Invalid ip address.")
    exit()
for i in ip:
    if i<0 or i>255:
        print("Invalid IP address.")
        exit()
sub=list(map(int,input("Enter subnet mask : ").split(".")))
if len(sub)!=4:
    print("Invalid subnet mask.")
    exit()
for i in sub:
    if i<0 or i>255:
        print("Invalid subnet mask.")
        exit()
bits=0                          # 255, 254, 252, 248, 240, 224, 192, 128
for i in sub:
    bits=(bits<<8)|i
bitsInv=bits^0xFFFFFFFF         # Invert the bits
if(bitsInv & (bitsInv+1))==0:   # 0xFFFFFFFF=11111111111111111111111111111111    i.e., print(bin(0xFFFFFFFF))
    pass
else:
    print("Invalid subnet mask.")
    exit()
net=[]
for i in range(0,len(ip)):
    net.append(ip[i] & sub[i])
print(f"Network address : {'.'.join(map(str,net))}")
# Subnet mask to binary
subBin=DecToBin(sub)            #  List of strings
subBin=''.join(subBin)          #  One string
# Network address to binary
netBin=DecToBin(net)
netBin=''.join(netBin)
pos=subBin.rfind('1')
broadBin=netBin[:pos+1]+'1'*(31-pos)
broad=[]
for i in range(0,len(broadBin),8):
    broad.append(broadBin[i:i+8])
broad=BinToDec(broad)
print(f"Broadcast address : {'.'.join(map(str,broad))}")
# Total number of usable host addresses
TotalHosts=(2**(31-pos))-2
# TotalHosts=(2**(32-(pos+1)))-2
print(f"Total number of usable host addresses : {TotalHosts}")
first=net[:]    # First usable host address
first[-1]+=1
print(f"First usable host address : {'.'.join(map(str,first))}")
last=broad[:]   # Last usable host address
last[-1]-=1
print(f"Last usable host address : {'.'.join(map(str,last))}")