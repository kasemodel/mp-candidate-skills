;(function() {
	'use strict';

	angular.module('clientApp')
	  .service('evaluationService', evaluationService);

	evaluationService.$inject = ['$http', '$q', 'clientConstants']
	function evaluationService($http, $q, clientConstants) {
		return ({
			submitUser: submitUser
		});

		function submitUser(user) {
			var request = $http({
				method: 'post',
				url: clientConstants.serverAddr + 'user',
				data: JSON.stringify(user),
				headers: {
					'Content-Type': 'application/json'
				}
			});
			return (request.then(handleSuccess, handleError));
		}

		function handleSuccess(response) {
			return(response.data);
		}

		function handleError(response) {
			if (!angular.isObject( response.data ) || !response.data.message) {
				return($q.reject('Houve um erro ao tentar enviar as informações. Por favor, tente novamente mais tarde.'));
			}
			return($q.reject(response.data.message));
		}
	}
})();
