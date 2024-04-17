ip=list(map(int,input("Enter IP address : ").split(".")))
if len(ip)!=4:
    print("Invalid ip address.")
    exit()
for i in ip:
    if i<0 or i>255:
        print("Invalid IP address!")
        exit()
sub=list(map(int,input("Enter subnet mask : ").split(".")))
if len(sub)!=4:
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
    net.append(str(ip[i] & sub[i]))
print(f"Network address : {".".join(net)}")