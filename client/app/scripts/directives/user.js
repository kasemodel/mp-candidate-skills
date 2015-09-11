;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('user', user);

	function user() {
	    return {
			templateUrl: '../views/user.html',
			restrict: 'E',
			scope: {
				user: '='
			}
	    }
	}
})();
