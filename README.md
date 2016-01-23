# re-natal-om-next

Want to use re-natal with om-next?  Just follow the steps below (it's pretty easy).  

## Usage
1. Download and install re-natal and all of it's dependencies
2. Run re-natal init with your project name [c5745272f8b27aa885d0ee430334fdd0c411be85](diff)
```sh
$ re-natal init reNatalOmNext 
```
3. Edit project.clj and update the dependencies  (4f696314e001bb060971ff8ff2bf59bb9c2fb3ca)
4. Delete the db.cljs, handlers.cljs, and subs.cljs files in src/<project_name>/ (04d91e1e78f609db47038c4b6a1f4324b78f9ff3)
5. Remove references to reagent and the figwheel counter in the env/dev/env/[android|ios]/main.cljs files (6b76367356cc831857cb06dc61309ffe84552293) 
6. Put in the om-next code from regular natal and put the (om/add-root!) part in an init function (d628c123877cd05716ba0353e658180fa9f511f1)

