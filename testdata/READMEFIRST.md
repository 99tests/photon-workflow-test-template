Place test data files in this folder

Reference the files via relative path

For example, if you had a file called `usercredentials.json`, reference it in java via
`new File('testdata/usercredentials.json`.

To access the file, you can either use the relative path like so:

	new File("testdata/usercredentials.json")
	
or in the file for uploads etc., you'll need the absolute path of `usercredentials.json`, which can be obtained via the `getTestDataPath` method:

	new File(session.getTestDataPath("usercredentials.json");
	
Note that the path in this case does not include `testdata/`.

Not following the above instructions will result in code that executes on your machine, but not on our servers, and your code will not be approved, so please ensure that you take care of this.
	
	