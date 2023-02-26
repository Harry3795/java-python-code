import csv
with open("doc1.txt",newline='') as  csvfile:
    rows=csv.reader(csvfile,delimiter=',')
    data=[];
    # data = {}
    for row in rows:
        data.append(row)
        # data[row[0]]=row[1:]

print(data)
for item in data:
    print(item(0))
# for key in data:
#     print(data[key])