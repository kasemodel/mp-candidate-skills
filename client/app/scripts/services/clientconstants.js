;(function() {
	'use strict';

	angular.module('clientApp')
	  .constant('clientConstants', clientConstants());

	function clientConstants() {
		return {
			'serverAddr': 'http://localhost:8080/'
		}
	}


})();