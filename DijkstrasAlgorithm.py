V=int(input("Enter the number of nodes/vertices : "))
E=int(input("Enter the number of edges : "))
graph={}
for i in range(1,E+1):
    src,des,wt=input(f"Enter edge {i} (source, destination, weight) : ").split()
    if src not in graph:
        graph[src]={}
    if des not in graph:
        graph[des]={}
    graph[src][des]=int(wt)
    #graph[des][src]=int(wt)     # For undirected graph
StartNode=input("Enter the starting node : ")
distances={}
predecessors={}
for i in graph:
    distances[i]=float('infinity')
    predecessors[i]=""
distances[StartNode]=0
visited=set()
while len(visited)<len(graph):
    CurrentNode=""
    min_distance=float('infinity')
    for i in graph:
        if i not in visited and distances[i]<min_distance:
            min_distance=distances[i]
            CurrentNode=i
    if CurrentNode == "":
        break
    else:
        visited.add(CurrentNode)
        for i,j in graph[CurrentNode].items():
            if (distances[CurrentNode]+j)<distances[i]:
                distances[i]=(distances[CurrentNode]+j)
                predecessors[i]=CurrentNode
for i,j in distances.items():
    print(f"Shortest distance from {StartNode} to {i} is {j}")
for i in graph:
    path=[]
    temp=i
    while temp!=StartNode:
        path.append(temp)
        temp=predecessors[temp]
    path.append(StartNode)
    path.reverse()
    print(f"Shortest path from {StartNode} to {i} is {' -> '.join(path)}")