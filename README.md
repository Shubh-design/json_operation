# json_operation
Fetching data from json files and merge into another json file by using java
JSON-Merge
Write a program that can merge a series of files containing JSONarray of Objects into a single
file containing one JSON object.
Example: Suppose there are 3 files -data1.json, data2.json, data3.json.
Let's saydata1.jsoncontains -{"strikers":[{ "name": "Alexis Sanchez", "club": "Manchester
United" },{ "name": "Robin van Persie", "club": "Feyenoord" }]}
data2.jsoncontains -{"strikers":[{ "name": "Nicolas Pepe","club": "Arsenal" }] }
data3.jsoncontains -{"strikers":[{ "name": "Gonzalo Higuain", "club": "Napoli" },{ "name": "Sunil
Chettri", "club": "Bengaluru FC" }] }
A merge of these 3 files will generate a file with the following data.merge1.json -{"strikers":[{
"name": "Alexis Sanchez", "club": "Manchester United" },{ "name": "Robin van Persie", "club":
"Feyenoord" },{ "name": "Nicolas Pepe","club": "Arsenal" },{ "name": "Gonzalo Higuain", "club":
"Napoli" },{ "name": "Sunil Chettri", "club": "Bengaluru FC" }] }

reading a file and writing a file so time complexity is O(n) for the above program.
