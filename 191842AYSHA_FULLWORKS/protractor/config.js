exports.config = {
	framework: 'jasmine', 
	directConnect:true, 
	specs: ['newspec.js'],
	onPrepare() { 
		 ({ 
		  project: require('path').join(__dirname,'./tsconfig.json') 
		});
	} 
}