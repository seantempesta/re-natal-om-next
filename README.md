# re-natal-om-next

Want to use re-natal with om-next?  Just follow the steps below (it's pretty easy).  

## Usage
1. Download and install re-natal and all of it's dependencies
2. Run re-natal init with your project name
```sh
$ re-natal init reNatalOmNext
```
3. Edit project.clj and update the dependencies 
4. Delete the db.cljs, handlers.cljs, and subs.cljs files in src/<project_name>/
5. Remove references to reagent and the figwheel counter in the env/dev/env/[android|ios]/main.cljs files
6. Put in the om-next code from regular natal and put the (om/add-root!) part in an init function

